package slot12;

import java.util.Scanner;

public class News implements INews {

    int ID;
    String Title;
    String PublishDate;
    String Author;
    String Content;
    float AverageRate;
    float [] RateList;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    @Override
    public void Display() {

        System.out.println("Title: " + Title);
        System.out.println("Publish Date: " + PublishDate);
        System.out.println("Author: " + Author);
        System.out.println("Content: " + Content);
        System.out.println("Average Rate: " + AverageRate);
    }

    public void Calculate(){
        float sum = 0;
        for (float rate : RateList) {
            sum += rate;
        }
        AverageRate = sum / RateList.length;
    }

    public void InputRate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rates: ");
        int numOfRates = scanner.nextInt();
        RateList = new float[numOfRates];
        for (int i = 0; i < numOfRates; i++) {
            System.out.print("Enter rate " + (i + 1) + ": ");
            RateList[i] = scanner.nextFloat();
        }
        scanner.close();
        Calculate();
    }


}
