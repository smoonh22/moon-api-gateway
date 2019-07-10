package com.longcoding.moon.models.apis;

import com.longcoding.moon.models.enumeration.TransformType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * The object for the case where the transform is required.
 * It is an object based on application-apis.yml.
 *
 * It will be loaded into the cache in future APIExposeSpecLoader.
 * If the type of application-apis.yml changes, you can change the object.
 *
 * Variable name, and position in the current request.
 * It then contains the name of the new variable to be changed in the future and the new location.
 *
 * @author longcoding
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "transform_data")
public class TransformData implements Serializable, Cloneable {

    @Id @GeneratedValue
    int id;

    String targetKey;
    String newKeyName;
    TransformType currentPoint;
    TransformType targetPoint;

}
