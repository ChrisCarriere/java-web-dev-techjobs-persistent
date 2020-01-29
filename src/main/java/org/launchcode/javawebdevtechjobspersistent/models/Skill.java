package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @Size(max = 500)
    public String skillDescription;

    public String getSkillDescription() {
        return skillDescription;
    }

    public void setDescription(String skillDescription) {
        this.skillDescription = skillDescription;
    }

    public Skill(){
    }

}