
package com.khan.abstractdocument.domain;

import java.util.Optional;

import com.khan.abstractdocument.Document;

/**
 * HasModel trait for static access to 'model' property
 */
public interface HasModel extends Document {

  String PROPERTY = "model";

  default Optional<String> getModel() {
    return Optional.ofNullable((String) get(PROPERTY));
  }

}
