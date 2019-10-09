/*
 * API v1
 * FormAPI is a service that helps you fill out and sign PDF templates.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.formapi;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Templatesv2TemplateDocumentMetadata
 */
@javax.annotation.Generated(value = "io.formapi.codegen.FormApiJavaClientCodegen", date = "2019-10-10T00:49:37.967+07:00[Asia/Bangkok]")
public class Templatesv2TemplateDocumentMetadata {
  public static final String SERIALIZED_NAME_FILENAME = "filename";
  @SerializedName(SERIALIZED_NAME_FILENAME)
  private String filename = null;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size = null;

  /**
   * Gets or Sets mimeType
   */
  @JsonAdapter(MimeTypeEnum.Adapter.class)
  public enum MimeTypeEnum {
    APPLICATION_PDF("application/pdf");

    private String value;

    MimeTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MimeTypeEnum fromValue(String text) {
      for (MimeTypeEnum b : MimeTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<MimeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MimeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MimeTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MimeTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_MIME_TYPE = "mime_type";
  @SerializedName(SERIALIZED_NAME_MIME_TYPE)
  private MimeTypeEnum mimeType = null;

  public Templatesv2TemplateDocumentMetadata filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * Get filename
   * @return filename
  **/
  @ApiModelProperty(value = "")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public Templatesv2TemplateDocumentMetadata size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public Templatesv2TemplateDocumentMetadata mimeType(MimeTypeEnum mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * Get mimeType
   * @return mimeType
  **/
  @ApiModelProperty(value = "")
  public MimeTypeEnum getMimeType() {
    return mimeType;
  }

  public void setMimeType(MimeTypeEnum mimeType) {
    this.mimeType = mimeType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Templatesv2TemplateDocumentMetadata templatesv2TemplateDocumentMetadata = (Templatesv2TemplateDocumentMetadata) o;
    return Objects.equals(this.filename, templatesv2TemplateDocumentMetadata.filename) &&
        Objects.equals(this.size, templatesv2TemplateDocumentMetadata.size) &&
        Objects.equals(this.mimeType, templatesv2TemplateDocumentMetadata.mimeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, size, mimeType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Templatesv2TemplateDocumentMetadata {\n");
    
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

