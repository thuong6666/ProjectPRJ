package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import model.Voucher;
import service.DBContext;

public class VoucherDAO extends DBContext {
    public List<Voucher> getAllVouchers() {
        List<Voucher> vouchers = new ArrayList<>();

        String sql = "SELECT [Code], [Discount], [Targets], [Description], [StartDate], [EndDate]\n" +
                     "FROM dbo.Voucher";

        try (
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery()
        ) {
            while (rs.next()) {
                Voucher voucher = new Voucher(
                    rs.getString("Code"),
                    rs.getInt("Discount"),
                    rs.getInt("Targets"),
                    rs.getString("Description"),
                    rs.getString("StartDate"),
                    rs.getString("EndDate")
                );
                vouchers.add(voucher);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception appropriately
        }
        return vouchers;
    }
    
    public void addVoucher(HttpServletRequest request, Voucher voucher) {
        String sql = "INSERT INTO dbo.Voucher (Code, Discount, Targets, Description, StartDate, EndDate)\n" +
                     "VALUES (?, ?, ?, ?, ?, ?)";

        try (
            PreparedStatement st = connection.prepareStatement(sql)
        ) {
            st.setString(1, voucher.getCode());
            st.setInt(2, voucher.getDiscount());
            st.setInt(3, voucher.getTargets());
            st.setString(4, voucher.getDescription());
            st.setString(5, voucher.getStartDate());
            st.setString(6, voucher.getEndDate());

            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception appropriately
        }
    }
    
    public void removeVoucher(String voucherCode) {
        String sql = "DELETE FROM dbo.Voucher WHERE Code = ?";
        try (
            PreparedStatement st = connection.prepareStatement(sql)
        ) {
            st.setString(1, voucherCode);

            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception appropriately
        }
    }
}
