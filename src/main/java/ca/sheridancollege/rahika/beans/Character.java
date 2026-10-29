package ca.sheridancollege.rahika.beans;

import ca.sheridancollege.rahika.data.Element;
import ca.sheridancollege.rahika.data.WeaponType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Character {
	private long id;
	private String name;
	private WeaponType weaponType;
	private Element element;
}
