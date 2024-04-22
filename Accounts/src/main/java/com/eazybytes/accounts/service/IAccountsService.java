package com.eazybytes.accounts.service;


import com.eazybytes.accounts.dto.CustomerDto;

//"I" programming practice for interface
public interface IAccountsService {

    void createAccount(CustomerDto customerDto);

    /*
    * @param mobileNumber - Input mobile number
    * @return Account details based on mobileNumber
    * */

    CustomerDto fetchAccount(String mobileNumber);

    //@return bool if update of acc is success or not
    boolean updateAccount(CustomerDto customerDto);

//    @return boolean id deleted or not

    boolean deleteAccount(String mobileNumber);
}
