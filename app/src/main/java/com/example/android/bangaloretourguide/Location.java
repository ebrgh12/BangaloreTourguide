package com.example.android.bangaloretourguide;
/**
 * Created by giris on 7/15/2016.
 */
    public class Location {
                /** Image resource ID for the word */
                private int mImageResourceId= NO_IMAGE_PROVIDED;
              /* A CONSTANT VARIABLE WHICH REPRESENTS NO IMAGE WAS PROVIDED */
                private static final int NO_IMAGE_PROVIDED =-1;
                   private String mlocationdetails;
                    private String mlocationname;
                    public Location(String defaultlocation, String defaultdetails)
                    {
                        mlocationdetails = defaultlocation;
                        mlocationname = defaultdetails;
                    }
                    public Location(String defaultlocations2, String defaultdetails2, int imageResourceId){
                        mlocationdetails = defaultlocations2;
                        mlocationname = defaultdetails2;
                        mImageResourceId =  imageResourceId;
                    }
                    /**
              * Get the default of the location.
              */
                    public String getDefaultlocation()
                    {
                    return mlocationdetails;
                    }
                   public String getDefaultdetails()
                   {
                    return mlocationname;
                   }
                /* Return the image resource ID of the word. */
                    public int getmImageResourceId(){
                        return mImageResourceId;
                    }
                    public boolean hasImage(){
                        return  mImageResourceId != NO_IMAGE_PROVIDED;
                    }
     }



