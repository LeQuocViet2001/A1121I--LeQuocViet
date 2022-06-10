package model.service.impl;

import model.bean.ContractDAO.AttachService;
import model.bean.ContractDAO.Contract;
import model.bean.ContractDAO.ContractDetail;
import model.repository.impl.ContractRepository;
import model.repository.inteface.IContractRepositoty;
import model.service.IContractService;

import java.util.List;

public class ContractService implements IContractService {
    private IContractRepositoty iContractRepositoty = new ContractRepository();
    @Override
    public List<Contract> getListContract() {
        return  iContractRepositoty.getListContract();
    }

    @Override
    public boolean addContract(Contract contract) {
        return  iContractRepositoty.addContract(contract);
    }

    @Override
    public List<AttachService> getListAttachService() {
        return  iContractRepositoty.getListAttachService();
    }

    @Override
    public boolean updateContractDetail(int i, ContractDetail contractDetail) {
        return false;
    }

    @Override
    public boolean addDetailContract(ContractDetail contractDetail) {
        return  iContractRepositoty.addDetailContract(contractDetail);
    }
}
