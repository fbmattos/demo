package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SpeakerItem
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-09T12:14:47.950Z")
public class SpeakerItem {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("profile")
  private String profile = null;

  public SpeakerItem id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "12345", required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SpeakerItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Ben Golub", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SpeakerItem title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "CEO, Docker", required = true, value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public SpeakerItem profile(String profile) {
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @ApiModelProperty(example = "Ben Golub is a serial entrepreneur and start-up CEO, and the current CEO of Docker, the company behind the Docker open source platform, and the chief sponsor of the Docker ecosystem. Docker is an open platform for developers and system administrators to build, ship, run and orchestrate distributed applications. Prior to Docker, Golub was CEO of Gluster, the open source, scale out storage company, which was successfully acquired by Red Hat in 2011. Prior to Gluster, Golub was CEO of social media pioneer Plaxo, which was acquired by Comcast in 2008. Prior to Plaxo, Golub spent eight years at VeriSign, Inc., serving as Chief Marketing Officer, as Senior Vice President of the security and payments business, and as General Manager of VeriSign&#39;s managed security services business. Ben tweets at @golubbe", required = true, value = "")
  public String getProfile() {
    return profile;
  }

  public void setProfile(String profile) {
    this.profile = profile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpeakerItem speakerItem = (SpeakerItem) o;
    return Objects.equals(this.id, speakerItem.id) &&
        Objects.equals(this.name, speakerItem.name) &&
        Objects.equals(this.title, speakerItem.title) &&
        Objects.equals(this.profile, speakerItem.profile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, title, profile);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpeakerItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
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

