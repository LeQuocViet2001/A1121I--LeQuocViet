//package codegym.vn.casestudy_spring.controller;
//
//
//import codegym.vn.casestudy_spring.entity.ContractDao.Contract;
//import codegym.vn.casestudy_spring.entity.CustomerDAO.Customer;
//import codegym.vn.casestudy_spring.entity.CustomerDAO.CustomerType;
//import codegym.vn.casestudy_spring.service.ContractService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.List;
//import java.util.Optional;
//
//@Controller
//@RequestMapping("/contract")
//public class ContractController {
//
//    @Autowired
//    ContractService contractService;
//
//
//    @GetMapping("/list")
//    public String listContract(Model model, @RequestParam(value = "page") Optional<Integer> page){
//        int currentPage = page.orElse(1);
//        int pageSize =  5;
//
//        Page<Contract> contract = contractService.getAll( PageRequest.of(currentPage - 1, pageSize));
//        model.addAttribute("contract",contract );
//
//        List<CustomerType> customerTypes = customerTypeService.getAll();
//        model.addAttribute("customerTypes", customerTypes);
//
//        int numbers = customers.getNumber();
//        int totalItems = customers.getNumberOfElements();
//        int totalPages = customers.getTotalPages();
//        model.addAttribute("totalItems", totalItems);
//        model.addAttribute("totalPages", totalPages);
//        model.addAttribute("currentPage", currentPage);
//        model.addAttribute("numbers", numbers);
//        return "customer/list";
//    }
//}
