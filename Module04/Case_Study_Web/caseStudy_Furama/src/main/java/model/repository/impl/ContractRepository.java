package model.repository.impl;

import model.bean.ContractDAO.AttachService;
import model.bean.ContractDAO.Contract;
import model.bean.ContractDAO.ContractDetail;
import model.repository.BaseRepository;
import model.repository.inteface.IContractRepositoty;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContractRepository implements IContractRepositoty {
    @Override
    public List<Contract> getListContract() {
        List<Contract> list = new ArrayList<>();
        Connection cn = BaseRepository.getConnect();
        try {
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM cg_furama.contract;");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int contract_id = rs.getInt("contract_id");
                String contract_start_date = rs.getString("contract_start_date");
                String contract_end_date = rs.getString("contract_end_date");
                double contract_deposit = rs.getDouble("contract_deposit");
                double contract_total_money = rs.getDouble("contract_total_money");
                int employee_id = rs.getInt("employee_id");
                int customer_id = rs.getInt("customer_id");
                int service_id = rs.getInt("service_id");
                Contract contract = new Contract(contract_id, contract_start_date, contract_end_date, contract_deposit, contract_total_money, employee_id, customer_id, service_id);
                list.add(contract);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean addContract(Contract c) {
        Connection cn = BaseRepository.getConnect();
        String sql = "INSERT INTO `cg_furama`.`contract` ( `contract_start_date`, `contract_end_date`, `contract_deposit`, " +
                "`contract_total_money`, `employee_id`, `customer_id`, `service_id`) " +
                "VALUES ( ?, ? , ?, ?, ? , ?, ?);\n";
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, c.getContract_start_date());
            ps.setString(2, c.getContract_end_date());
            ps.setDouble(3, c.getContract_deposit());
            ps.setDouble(4, c.getContract_total_money());
            ps.setInt(5, c.getEmployee_id());
            ps.setInt(6, c.getCustomer_id());
            ps.setInt(7, c.getService_id());

            if (ps.executeUpdate() > 0) return true;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return false;
    }

    @Override
    public List<AttachService> getListAttachService() {
        Connection cn = BaseRepository.getConnect();
        List<AttachService> list = new ArrayList<>();
        try {
            PreparedStatement ps = cn.prepareStatement("select * from attach_service");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                int attach_service_id = rs.getInt("attach_service_id");
                String attach_service_name = rs.getString("attach_service_name");
                String attach_service_status = rs.getString("attach_service_status");
                double attach_service_cost = rs.getDouble("attach_service_cost");
                int attach_service_unit = rs.getInt("attach_service_unit");

                AttachService attachService = new AttachService(attach_service_id, attach_service_name, attach_service_status, attach_service_cost, attach_service_unit);
                list.add(attachService);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean addDetailContract(ContractDetail contractDetail) {
        Connection nec = BaseRepository.getConnect();
        try {
            CallableStatement sta = nec.prepareCall("call insert_Detail(?,?,?)");
            sta.setInt(1, contractDetail.getContract_id());
            sta.setInt(2, contractDetail.getAttach_service_id());
            sta.setInt(3, contractDetail.getQuantity());
            if (sta.executeUpdate() > 0) return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }
}
