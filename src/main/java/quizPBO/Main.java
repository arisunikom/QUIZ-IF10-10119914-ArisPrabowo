/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizPBO;

/**
 *
 * @author 
 * Aris Prabowo
 * IF10K 10119914
 */
public class Main {
    public static void main(String[] args) {
        ServicePrice servicePrice = new ServicePrice();
        Customer customer = new Customer();
        String nama = "Aris";
        String email =  "aris@dropsuite.com";
        boolean member = true;
        int choosen = 3;
        
        customer.setName(nama);
        customer.setEmail(email);
        customer.setMember(member);
        servicePrice.setPriceService(100000);
        servicePrice.getPrice(choosen);
        
        System.out.print("======Program Kasir Rock n Roll======");
        System.out.println("Customer Name: "+customer.getName());
        System.out.println("Customer Email: "+customer.getEmail());
        servicePrice.displayService();
        System.out.println(choosen);
        System.out.println("Are You Member (Yes/no): "+customer.isMember());
        System.out.println("======Invoice======");
        System.out.println("Date Transaction: "+customer.currentTime());
        System.out.println("Service Price: "+servicePrice.getPriceService());
        System.out.println("Discount: "+servicePrice.getSale(customer.isMember(), servicePrice.getPriceService()));
        System.out.println("Total Pay: "+servicePrice.getTotalPay(servicePrice.getPriceService(), servicePrice.getSale(customer.isMember(), servicePrice.getPriceService())));
    }
    
}
