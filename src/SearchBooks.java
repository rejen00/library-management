/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
/**
 *
 * @author USER
 */
public class SearchBooks extends JFrame {

    private JTextField searchField;
    private JButton searchButton;
    private JComboBox<String> searchTypeBox;
    private JTable resultTable;

    public SearchBooks() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Search Books and Students");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 450);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Top panel
        JPanel topPanel = new JPanel(new FlowLayout());
        searchField = new JTextField(30);
        searchButton = new JButton("Search");
        searchTypeBox = new JComboBox<>(new String[]{"Search by Student", "Search by Book"});

        topPanel.add(new JLabel("Search Book/Student NAME:"));
        topPanel.add(searchField);
        topPanel.add(searchTypeBox);
        topPanel.add(searchButton);
        add(topPanel, BorderLayout.NORTH);

        // Table setup
        resultTable = new JTable(new DefaultTableModel());
        JScrollPane scrollPane = new JScrollPane(resultTable);
        add(scrollPane, BorderLayout.CENTER);

        // Button action
        searchButton.addActionListener(e -> {
            String keyword = searchField.getText().trim();
            if (keyword.isEmpty()) {
                
                JOptionPane.showMessageDialog(this, "Please enter a search keyword.");
                return;
            }
            String type = (String) searchTypeBox.getSelectedItem();
            if ("Search by Student".equals(type)) {
                searchStudent(keyword);
            } else {
                searchBook(keyword);
            }
        });
    }

    private void searchStudent(String keyword) {
        Connection con = Connect.ConnectToDB();
        if (con == null) {
            JOptionPane.showMessageDialog(this, "Database connection failed.");
            return;
        }

        String[] columns = {"Student ID", "Name", "Course", "Branch", "Semester",
                            "Book ID", "Book Name", "Issuedate", "Due", "Status"};
        DefaultTableModel model = new DefaultTableModel(null, columns);
        resultTable.setModel(model);

        String sql = "SELECT s.studentid, s.name, s.course, s.branch, s.semester, " +
                     "b.id, b.name AS book_name, b.issuedate, b.due, b.status " +
                     "FROM student s LEFT JOIN book b ON s.studentid = b.studentid " +
                     "WHERE s.studentid = ? OR s.name LIKE ?";

        try (PreparedStatement pst = con.prepareStatement(sql)) {
            try {
                pst.setInt(1, Integer.parseInt(keyword));
            } catch (NumberFormatException e) {
                pst.setInt(1, -1); // no match
            }
            pst.setString(2, "%" + keyword + "%");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("studentid"),
                    rs.getString("name"),
                    rs.getString("course"),
                    rs.getString("branch"),
                    rs.getString("semester"),
                    rs.getString("id"),
                    rs.getString("book_name"),
                    rs.getString("issuedate"),
                    rs.getString("due"),
                    rs.getString("status")
                });
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Search error: " + e.getMessage());
        }
    }

    private void searchBook(String keyword) {
        Connection con = Connect.ConnectToDB();
        if (con == null) {
            JOptionPane.showMessageDialog(this, "Database connection failed.");
            return;
        }

        String[] columns = {"Book ID", "Book Name", "Publisher", "Year", "Status", "Issuedate", "Due",
                            "Student ID", "Student Name"};
        DefaultTableModel model = new DefaultTableModel(null, columns);
        resultTable.setModel(model);

        String sql = "SELECT b.id, b.name AS book_name, b.publisher, b.year, b.status, " +
                     "b.issuedate, b.due, s.studentid, s.name AS student_name " +
                     "FROM book b LEFT JOIN student s ON b.studentid = s.studentid " +
                     "WHERE b.id = ? OR b.name LIKE ?";

        try (PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, keyword);
            pst.setString(2, "%" + keyword + "%");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("id"),
                    rs.getString("book_name"),
                    rs.getString("publisher"),
                    rs.getString("year"),
                    rs.getString("status"),
                    rs.getString("issuedate"),
                    rs.getString("due"),
                    rs.getInt("studentid"),
                    rs.getString("student_name")
                });
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Search error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SearchBooks().setVisible(true));
    }
}
