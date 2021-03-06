package com.priyankaj.doctorsapp.ui;

import android.app.Activity;

import com.priyankaj.doctorsapp.BasePresenter;
import com.priyankaj.doctorsapp.BaseView;
import com.priyankaj.doctorsapp.model.AboutDetails;
import com.priyankaj.doctorsapp.model.AppointmentDetailsRequest;
import com.priyankaj.doctorsapp.model.CategoryDetails;
import com.priyankaj.doctorsapp.model.City;
import com.priyankaj.doctorsapp.model.Doctors;
import com.priyankaj.doctorsapp.model.VisionDetails;

import java.util.ArrayList;

/**
 * Created by Vibhuti on 5/9/2018.
 */

public class DoctorAppContract {

    /**
     * Doctor app screen View
     */
    interface View extends BaseView<Presenter> {

        public void displayCategoryDetails(ArrayList<CategoryDetails.Category> categoryDetailsList);
        public void displayVisionDetails(ArrayList<VisionDetails.Vision> visionDetailsList);
        public void displayAboutDetails(ArrayList<AboutDetails.AboutUs> aboutDetailsList);
        public void displayCityDetails(ArrayList<City> cityArrayList);
        public void displayDoctorDetails(ArrayList<Doctors> doctorDetailsList);
        public void showformDisplaySuccess(String appointments);
        public void showformDisplayFaliure(String message);
        public void fetchDataFailure(String message);
    }

    /**
     * Doctor app screen Presenter
     */
    interface Presenter extends BasePresenter {
        void fetchCategoryDetails(Activity context);
        void fetchVisionDetails(Activity context);
        void fetchAboutDetails(Activity context);
        void fetchDoctorDetails(Activity context);
        void fetchCityDetails(Activity context);
        void sendFormData(Activity context,AppointmentDetailsRequest appointmentDetailsRequest);
    }
}
