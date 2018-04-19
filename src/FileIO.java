import java.io.*;
import java.util.StringTokenizer;

public class FileIO<T> {

    private  String fileName = "products.csv";

    public FileIO(String fileName){
        this.fileName = fileName;
    }

    public Lista<Product> readProducts() throws IOException {
        FileReader fr  = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        ProductDynArray products = new ProductDynArray();
        String line = null;
        while ((line = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(line,",");
            String name = st.nextToken();
            float price = Double.valueOf(st.nextToken()).floatValue();
            Product product = new Product(name,price);
            products.add(product);
        }
        br.close();
        return products;
    }

    public void writeProducts(Lista<Product> products) throws IOException {
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);

        for (int i = 0; i < products.getSize(); i++) {
            Product product = products.getItem(i);
            bw.write(product.toString());
            bw.newLine();
        }
        bw.close();
    }
}
