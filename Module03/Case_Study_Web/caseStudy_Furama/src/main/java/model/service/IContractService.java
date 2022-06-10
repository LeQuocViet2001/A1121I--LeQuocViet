package model.service;

import model.bean.ContractDAO.AttachService;
import model.bean.ContractDAO.Contract;
import model.bean.ContractDAO.ContractDetail;

import java.util.List;

public interface IContractService {
    List<Contract> getListContract();

    boolean addContract(Contract contract);

    List<AttachService> getListAttachService();
    boolean updateContractDetail(int i, ContractDetail contractDetail);


    boolean addDetailContract(ContractDetail contractDetail);
}
