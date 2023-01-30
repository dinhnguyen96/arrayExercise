import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ProductManager {

    private final ArrayList<Product> productList;


    public ProductManager()
    {
        productList = new ArrayList<>();
        productList.add(new Product(1,"Laptop MacBook Pro 14 M1 Pro 2021 8",42990000));
        productList.add(new Product(2,"Laptop Apple MacBook Pro 14 M1 Pro 2021",66990000));
        productList.add(new Product(3,"Laptop Lenovo Ideapad 3 15IAU7 i3 1215U",12690000));
        productList.add(new Product(4,"Laptop Apple MacBook Pro 16 M1 Pro 2021 ",50190000));
        productList.add(new Product(5,"Laptop Dell Latitude 3520 i5 1135G7",16990000));
    }
    public void productDisplay()
    {
        for (Product product : productList)
        {
            System.out.println("Id : " + product.getId());
            System.out.println("Name : " + product.getName());
            System.out.println("Price : " + product.getPrice());
        }
    }

    public boolean productAdd(Product value)
    {
        boolean isChecked = false;
        for (Product product : productList)
        {
            if (product.getId() == value.getId())
            {
                isChecked = true;
                break;
            }
        }
        if (isChecked)
        {
            return true;
        }
        else
        {
            productList.add(value);
            return false;
        }
    }

    public boolean productUpdate(Integer id, String name)
    {
        int position = -1;
        for (int i = 0; i < productList.size(); i++)
        {
            if (productList.get(i).getId() == id)
            {
                position = i;
                break;
            }
        }
        if (position == -1)
        {
            return false;
        }
        else
        {
            Product product = productList.get(position);
            product.setName(name);
            return true;
        }
    }
    public boolean productRemove(Integer id)
    {
        int position = -1;
        for (int i = 0; i < productList.size(); i++)
        {
            if (productList.get(i).getId() == id)
            {
                position = i;
                break;
            }
        }
        if (position == -1)
        {
            return false;
        }
        else
        {
            Product product = productList.get(position);
            productList.remove(product);
            return true;
        }
    }
    public List<Product> searchByNameProduct(String name)
    {
        List<Product> nameProductSearch = new ArrayList<>();
        for (Product product : productList)
        {
            if (product.getName().equalsIgnoreCase(name))
            {
                nameProductSearch.add(product);
            }
        }
        return nameProductSearch;
    }

    public void ascendingPriceOrder()
    {
         Collections.sort(productList);

         productDisplay();
    }
    public void descendingPriceOrder()
    {
        productList.sort(Collections.reverseOrder());

        productDisplay();

    }
}
