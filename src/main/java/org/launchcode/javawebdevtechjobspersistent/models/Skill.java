package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs= new ArrayList<>();

    @Size(min = 3, max = 100, message = "skill description must be between 3 and 100 characters")
    public String skillDescription;

    public Skill(){}

    public String getSkillDescription() {
        return skillDescription;
    }

    public void setDescription(String skillDescription) {
        this.skillDescription = skillDescription;
    }

}