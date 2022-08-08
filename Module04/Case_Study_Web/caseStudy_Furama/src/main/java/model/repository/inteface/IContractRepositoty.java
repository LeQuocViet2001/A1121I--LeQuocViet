package model.repository.inteface;

import model.bean.ContractDAO.AttachService;
import model.bean.ContractDAO.Contract;
import model.bean.ContractDAO.ContractDetail;

import java.util.List;

public interface IContractRepositoty {
    List<Contract> getListContract();

    boolean addContract(Contract contract);

    List<AttachService> getListAttachService();

    boolean addDetailContract(ContractDetail contractDetail);

}
