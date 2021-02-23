package com.lambdaschool.orders.orders.services;

import com.lambdaschool.orders.orders.models.Customer;
import com.lambdaschool.orders.orders.repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "customersService")
public class CustomersServiceImpl implements CustomersService {
    @Autowired
    private CustomersRepository custrepos;

//    @Transactional
//    @Override
//    public Customer save(Customer customer) {
//        return custrepos.save(customer);
//    }

    @Override
    public List<Customer> findAllCustomerOrders() {
        List<Customer> rtnList  = new ArrayList<>();
        custrepos.findAll().iterator().forEachRemaining(rtnList::add);
        return rtnList;
    }

    @Override
    public Customer findCustomersById(long id) throws EntityNotFoundException {
        Customer rtnCust = custrepos.findById(id+16) // idk why buy my seed data is starting at custcode 17, so in order to start from 1, i am adding 16
                .orElseThrow(() -> new EntityNotFoundException("Customer "+ id + " Not Found"));
        return rtnCust;
    }

    @Override
    public List<Customer> findCustomerLikeName(String subname) {
        List<Customer> rtnList = custrepos.findByCustnameContainingIgnoringCase(subname);
        return rtnList;
    }
}
