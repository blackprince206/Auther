/**
 * Represents an Author with their details--name, email and physical address
 *
 * @author therapon
 *
 */

public class Author {

  private String name;
  private String email;
  private String address;

  /**
   * Creates a new author given the author's name, email and address as strings.
   *
   * @param name the author's name
   * @param email the author's email address
   * @param address the authors physical address
   */
  public Author(String name, String email, String address) {
    this.name = name;
    this.email = email;
    this.address = address;
  }

  /**
   * @return the name
   */
  public String getName() {
    return this.name;
  }

  /**
   * @return the email
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * @return the address
   */
  public String getAddress() {
    return this.address;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String toString() {
    return "Author [name=" + this.name + ", email=" + this.email + ", address=" + this.address
        + "]";
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = (prime * result) + ((this.address == null) ? 0 : this.address.hashCode());
    result = (prime * result) + ((this.email == null) ? 0 : this.email.hashCode());
    result = (prime * result) + ((this.name == null) ? 0 : this.name.hashCode());
    return result;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Author other = (Author) obj;
    if (this.address == null) {
      if (other.address != null) {
        return false;
      }
    } else if (!this.address.equals(other.address)) {
      return false;
    }
    if (this.email == null) {
      if (other.email != null) {
        return false;
      }
    } else if (!this.email.equals(other.email)) {
      return false;
    }
    if (this.name == null) {
      if (other.name != null) {
        return false;
      }
    } else if (!this.name.equals(other.name)) {
      return false;
    }
    return true;
  }

}
