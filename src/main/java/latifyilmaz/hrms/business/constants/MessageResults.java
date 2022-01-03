package latifyilmaz.hrms.business.constants;

import java.util.HashMap;
import java.util.Map;

public class MessageResults {
    public static final Map<String, String> models = new HashMap<>();

    static {
        models.put("email", "E-Mail");
        models.put("password", "Password");
        models.put("identityNo", "National Identification Number");
        models.put("user", "User");
        models.put("personnel", "Personel");
        models.put("employer", "Employer");
        models.put("employee", "Employee");
        models.put("position", "Job position");
        models.put("city", "City");
        models.put("workingTime", "Way of Working");
        models.put("jobAdvertisement", "Job advertisement");
        models.put("favoriteJob", "Favorite Job");
        models.put("resume", "Resume");
        models.put("school", "School");
        models.put("jobExperience", "Job Experience");
        models.put("language", "Language");
        models.put("ability", "Skill");
        models.put("image", "Picture");
    }

    public static final String emptyField = "Please do not leave this field blank!";
    public static final String emptyFields = "Please do not leave these fields blank!";
    public static final String oldPasswordMatchFalse = "Old password does not match!";
    public static final String passwordMatchFalse = "Passwords does not match!";
    public static final String newPasswordMatchFalse = "New passwords does not match!";
    public static final String jobAddedFavorite = "The ad has been added to favourites.";
    public static final String jobRemovedFavorite = "Ad removed from favorites.";
    public static final String errorLogin = "Email or Password is not correct. Try again!";
    public static final String successLogin = "Login successful! You are being redirected to the homepage.";
    public static final String verificationSuccessFalse = "Verification failed!";
    public static final String unverificationSuccessFalse = "Verification removal failed!";
    public static final String verificationSuccessTrue = "Verification successful!";
    public static final String unverificationSuccessTrue = "Verification removal successful!";
    public static final String isRealPersonFalse = "Failed to authenticate! Please make sure you have entered your information correctly.";
    public static final String isEmailFormatFalse = "E-Mail format is incorrect. Please enter an e-mail in the 'example@example.com' format.";
    public static final String validateEmail = "To complete your registration, you need to perform the activation that will be sent to your e-Mail.";
    public static final String validateEmailBySystem = "Your registration will be confirmed by our system as soon as possible. Thank you for your patience.";
    public static final String errorWhileUploadingFile = "There was a problem uploading the file!";
    public static final String error = "Sorry, an error has occurred.";
    public static String alreadyExists(String model){
        return String.format("This %s is already registered. Try another one.", models.get(model)); //
    }

    public static String notFound(String model){
        return String.format("No such record %s was found.", models.get(model));
    }

    public static String allDataListed(String model){
        return String.format("All %s data listed.", models.get(model));
    }

    public static String dataListed(String model){
        return String.format("%s data listed.", models.get(model));
    }

    public static String saved(String model){
        return String.format("%s successfully added to the system.", models.get(model));
    }

    public static String saveds(String model){
        return String.format("%s data successfully added to the system.", models.get(model));
    }

    public static String successfullySaved(String model){
        return String.format("%s successfully registered language.", models.get(model));
    }

    public static String saved(String model, String extraText){
        return String.format("%s registration successfully added to the system. %s", models.get(model), extraText);
    }

    public static String deleted(String model){
        return String.format("%s successfully deleted from the system.", models.get(model));
    }

    public static String deleteds(String model){
        return String.format("%s data successfully deleted from the system.", models.get(model));
    }

    public static String updated(String model){
        return String.format("%s successfully updated on the system.", models.get(model));
    }

    public static String emailSent(String email){
        return String.format("E-Mail successfully sent: %s", email);
    }

}
