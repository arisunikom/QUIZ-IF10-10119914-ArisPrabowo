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
 * 10119914 IF10K
 */
public class ServicePrice implements ServiceItem{
    private float priceService;
    private float discount;
    
    public float getPriceService(){
        return priceService;
    }
    public void setPriceService(float priceService){
        this.priceService = priceService;
    }
    @Override
    public void displayService(){
        System.out.println("#*************************#");
        System.out.println("#***Rock n Roll Haircut***#");
        System.out.println("#*******Service List******#");
        System.out.println("1. HairCut: IDR45K");
        System.out.println("2. Haircut + Hairwash: IDR 55K");
        System.out.println("3. Hairwash Only : IDR 15K");
        System.out.println("#*************************#");
        System.out.println("Choose (1/2/3): ");
    }
    @Override
    public float getPrice(int serviceItem){
        switch(serviceItem){
            case 1: 
                this.priceService = 45000;
                break;
            case 2:
                this.priceService = 55000;
                break;
            case 3:
                this.priceService = 15000;
            default:
                System.out.println("Masukan Angka Yang Benar!");
                break;
        }
        return priceService;
    }
    @Override
    public boolean checkMemberStatus(String statusMember){
        return "yes".equals(statusMember);
    }
    @Override
    public float getSale(boolean isMember, float parServicePrice){
        if(isMember == true){
            return discount = 0.1f*parServicePrice;
        }else{
            return discount = parServicePrice;
        }
    }
    public float getTotalPay(float priceService, float discount){
        float totalPay = this.priceService-discount;
        return totalPay;
    }
}
