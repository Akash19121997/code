package Stream.interview;


import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Questions {

    public static void main(String[] args) {


        //Immutable list, allows null
        var immutableList = Stream.of("Akash", "Pooja", null).toList();

        //Modifiable list, allows nulls
        var mutableList = Stream.of("Akash", "Pooja", null).collect(Collectors.toList());

        //Grouping by category
        List<Product> products = List.of(new Product("TV","Electronics",50000),
                new Product("Fridge","Electronics",50000),
                new Product("Levis","Dress",900),
                new Product("Mobile","Electronics",60000),
                new Product("Being Human","Dress",499)
                );

        Map<String, List<Product>> category = products.stream().collect(Collectors.groupingBy(Product::getCategory));
        System.out.println(category);

        //Aggregation: Calculating total price of products by category

        Map<String, Integer> categoryPrice= products.stream().collect(Collectors.groupingBy(Product::getCategory, Collectors.summingInt(Product::getPrice)));
        System.out.println(categoryPrice);

        //Average
        Map<String, Double> average= products.stream().collect(Collectors.groupingBy(Product::getCategory, Collectors.averagingInt(Product::getPrice)));
        System.out.println("Average :"+average);

        //counting
        Map<String, Long> counting=products.stream().collect(Collectors.groupingBy(Product::getCategory, Collectors.counting()));
        System.out.println(counting);

        //filtering price > 50
        List<Product> filtering50 = products.stream().filter(e -> e.getPrice()>900).toList();
        System.out.println(filtering50);

        //Mapping: Extracting product names
        List<String> names= products.stream().map(Product::getName).collect(Collectors.toList());
        System.out.println(names);

        //Partitioning: Separate products into expensive and cheap
        Map<Boolean, List<Product>> partition = products.stream().collect(Collectors.partitioningBy(e ->e.getPrice()>900));
        System.out.println(partition);

        //Using SummaryStatistics for product prices -> sum, average, min, max, count

        Map<String, IntSummaryStatistics> summaryInt= products.stream().collect(Collectors.groupingBy(Product::getCategory, Collectors.summarizingInt(Product::getPrice)));
        System.out.println("INT :"+summaryInt);
        Map<String, DoubleSummaryStatistics> summaryDouble= products.stream().collect(Collectors.groupingBy(Product::getCategory, Collectors.summarizingDouble(Product::getPrice)));
        System.out.println("Dou :"+summaryDouble);










    }
}
