
package betybatik.entity;


public class EntityService {

    
    public int diskon(int diskon,int harga){
           int total1 = (harga - ((harga*diskon)/100));
           return  (int)total1;
    }
    
    public  int transaksi(int subtotal,int bayar){
        int total = bayar-subtotal;
        return total;
    }
}
