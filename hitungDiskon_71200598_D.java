public class hitungDiskon_71200598_D {

    public static void main(String[] args) {
            Int banyak;
            Int jumlah;
            Int diskon;
            Int bayar;

            Scanner inp = new Scanner(System.in);
            banyak = inp
            for(int i = 0; i < banyak; i++){
                System.out.println("Harga barang ke-"+(i+1));
                Scanner inp = new Scanner(System.in);
                jumlah=jumlah+inp
            }
        System.out.println("Total Harga: "+jumlah);
            if (jumlah >= 101000 && jumlah <= 200000){
                diskon=5
            }
            else if (jumlah >= 201000 && jumlah <= 400000){
                diskon=10
            }
            else if (jumlah > 400000){
                diskon=20
            }
            else{
                diskon=0}

        System.out.println("Diskon : "+diskon+"%");
            bayar=jumlah-(jumlah*(diskon/100));
        System.out.println("Total bayar : "+bayar);

        }}

