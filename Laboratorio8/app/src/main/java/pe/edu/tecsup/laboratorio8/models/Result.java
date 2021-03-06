
package pe.edu.tecsup.laboratorio8.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
//import org.apache.commons.lang.builder.ToStringBuilder;

public class Result {

//    private String businessStatus;
//    private Geometry geometry;
//    private String icon;
//    private String id;
//    private String name;
//    private Boolean permanentlyClosed;
//    private List<Photo> photos = null;
//    private String placeId;
//    private PlusCode plusCode;
//    private Integer priceLevel;
//    private Double rating;
//    private String reference;
//    private String scope;
//    private List<String> types = null;
//    private Integer userRatingsTotal;
//    private String vicinity;
//    private OpeningHours openingHours;
//
//    public String getBusinessStatus() {
//        return businessStatus;
//    }
//
//    public void setBusinessStatus(String businessStatus) {
//        this.businessStatus = businessStatus;
//    }
//
//    public Geometry getGeometry() {
//        return geometry;
//    }
//
//    public void setGeometry(Geometry geometry) {
//        this.geometry = geometry;
//    }
//
//    public String getIcon() {
//        return icon;
//    }
//
//    public void setIcon(String icon) {
//        this.icon = icon;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Boolean getPermanentlyClosed() {
//        return permanentlyClosed;
//    }
//
//    public void setPermanentlyClosed(Boolean permanentlyClosed) {
//        this.permanentlyClosed = permanentlyClosed;
//    }
//
//    public List<Photo> getPhotos() {
//        return photos;
//    }
//
//    public void setPhotos(List<Photo> photos) {
//        this.photos = photos;
//    }
//
//    public String getPlaceId() {
//        return placeId;
//    }
//
//    public void setPlaceId(String placeId) {
//        this.placeId = placeId;
//    }
//
//    public PlusCode getPlusCode() {
//        return plusCode;
//    }
//
//    public void setPlusCode(PlusCode plusCode) {
//        this.plusCode = plusCode;
//    }
//
//    public Integer getPriceLevel() {
//        return priceLevel;
//    }
//
//    public void setPriceLevel(Integer priceLevel) {
//        this.priceLevel = priceLevel;
//    }
//
//    public Double getRating() {
//        return rating;
//    }
//
//    public void setRating(Double rating) {
//        this.rating = rating;
//    }
//
//    public String getReference() {
//        return reference;
//    }
//
//    public void setReference(String reference) {
//        this.reference = reference;
//    }
//
//    public String getScope() {
//        return scope;
//    }
//
//    public void setScope(String scope) {
//        this.scope = scope;
//    }
//
//    public List<String> getTypes() {
//        return types;
//    }
//
//    public void setTypes(List<String> types) {
//        this.types = types;
//    }
//
//    public Integer getUserRatingsTotal() {
//        return userRatingsTotal;
//    }
//
//    public void setUserRatingsTotal(Integer userRatingsTotal) {
//        this.userRatingsTotal = userRatingsTotal;
//    }
//
//    public String getVicinity() {
//        return vicinity;
//    }
//
//    public void setVicinity(String vicinity) {
//        this.vicinity = vicinity;
//    }
//
//    public OpeningHours getOpeningHours() {
//        return openingHours;
//    }
//
//    public void setOpeningHours(OpeningHours openingHours) {
//        this.openingHours = openingHours;
//    }
//
////    @Override
////    public String toString() {
////        return new ToStringBuilder(this).append("businessStatus", businessStatus).append("geometry", geometry).append("icon", icon).append("id", id).append("name", name).append("permanentlyClosed", permanentlyClosed).append("photos", photos).append("placeId", placeId).append("plusCode", plusCode).append("priceLevel", priceLevel).append("rating", rating).append("reference", reference).append("scope", scope).append("types", types).append("userRatingsTotal", userRatingsTotal).append("vicinity", vicinity).append("openingHours", openingHours).toString();
////    }
//
//
//    @Override
//    public String toString() {
//        return "Result{"+
//                "businessStatus="+businessStatus+
//                ",geometry='"+geometry+'\''+
//                ",icon='"+icon+'\''+
//                ",id='"+id+'\''+
//                ",name='"+name+'\''+
//                ",permanentlyClosed='"+permanentlyClosed+'\''+
//                ",photos='"+photos+'\''+
//                ",placeId='"+placeId+'\''+
//                ",plusCode='"+plusCode+'\''+
//                ",priceLevel='"+priceLevel+'\''+
//                ",rating='"+rating+'\''+
//                ",reference='"+reference+'\''+
//                ",scope='"+scope+'\''+
//                ",types='"+types+'\''+
//                ",userRatingsTotal='"+userRatingsTotal+'\''+
//                ",vicinity='"+vicinity+'\''+
//                ",openingHours='"+openingHours+'\''+
//                '}';
//    }


    private String businessStatus;
    private Geometry geometry;
    private String icon;
    private String id;
    private String name;
    private Boolean permanentlyClosed;
    private List<Photo> photos = null;
    private String placeId;
    private PlusCode plusCode;
    private Integer priceLevel;
    private Double rating;
    private String reference;
    private String scope;
    private List<String> types = null;
    private Integer userRatingsTotal;
    private String vicinity;
    private OpeningHours openingHours;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getBusinessStatus() {
        return businessStatus;
    }

    public void setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getPermanentlyClosed() {
        return permanentlyClosed;
    }

    public void setPermanentlyClosed(Boolean permanentlyClosed) {
        this.permanentlyClosed = permanentlyClosed;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    public PlusCode getPlusCode() {
        return plusCode;
    }

    public void setPlusCode(PlusCode plusCode) {
        this.plusCode = plusCode;
    }

    public Integer getPriceLevel() {
        return priceLevel;
    }

    public void setPriceLevel(Integer priceLevel) {
        this.priceLevel = priceLevel;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public Integer getUserRatingsTotal() {
        return userRatingsTotal;
    }

    public void setUserRatingsTotal(Integer userRatingsTotal) {
        this.userRatingsTotal = userRatingsTotal;
    }

    public String getVicinity() {
        return vicinity;
    }

    public void setVicinity(String vicinity) {
        this.vicinity = vicinity;
    }

    public OpeningHours getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(OpeningHours openingHours) {
        this.openingHours = openingHours;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }


}