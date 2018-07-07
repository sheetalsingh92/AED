/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.ArrayList;

/**
 *
 * @author Sheetal
 */
public class ImageDirectory {

    private ArrayList<Image> imageList;

    public ImageDirectory() {
        imageList = new ArrayList<>();
    }

    public Image addImage(Image image){
        imageList.add(image);
        return image;
    }

    public ArrayList<Image> getImageList() {
        return imageList;
    }
    
    
    
}
