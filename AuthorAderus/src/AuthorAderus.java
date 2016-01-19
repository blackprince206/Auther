/**
 * Represents an Author by his details--name, hello, salutation, goodmorning, howareyou, hola, and aloha
 *
 * @author aderus
 *
 */
public class AuthorAderus {

  private String name;
  private String hello;
  private String salutation;
  private String goodmorning;
  private String howareyou;
  private String hola;
  private String aloha;

  /**
   * Creates a class of greetings and presents them as strings.
   *
   * @param name the author's name
   * @param hello the author's hello
   * @param salutation the author's salutation
   * @param goodmorning the author's goodmorning
   * @param howareyou the author's howareyou
   * @param hola the author's hola
   * @param aloha the author's aloha
   */
  public AuthorAderus(String name, String hello, String salutation, String goodmorning, String howareyou, String hola, String aloha) {
	this.name = name;
	this.hello = hello;
    this.salutation = salutation;
    this.goodmorning = goodmorning;
    this.howareyou = howareyou;
    this.hola = hola;
    this.aloha = aloha;
  }
  public AuthorAderus(String name){
	  this.name = name;
  }

  /**
   * @return the name
   */
  public String getName() {
    return this.name;
  }
  
  /**
   * @return the hello
   */
  public String getHello() {
    return this.hello;
  }

  /**
   * @return the salutation
   */
  public String getSalutation() {
    return this.salutation;
  }

  /**
   * @return the goodmorning
   */
  public String getGoodmorning() {
    return this.goodmorning;
  }
  
  /**
   * @return the howareyou
   */
  public String getHowareyou() {
    return this.howareyou;
  }
  
  /**
   * @return the hola
   */
  public String getHola() {
    return this.hola;
  }
  
  /**
   * @return the aloha
   */
  public String getAloha() {
    return this.aloha;
  }
  
 }
