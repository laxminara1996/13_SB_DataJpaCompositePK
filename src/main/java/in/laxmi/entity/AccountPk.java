package in.laxmi.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class AccountPk implements Serializable  {
private Integer accNum;
private String accType;
}
