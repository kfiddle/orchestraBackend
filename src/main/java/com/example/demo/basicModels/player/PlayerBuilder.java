package com.example.demo.basicModels.player;

import com.example.demo.enums.Part;
import com.example.demo.enums.Type;

import javax.persistence.ElementCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PlayerBuilder {

    public Type type;
    public int rank;

    @ElementCollection
    public List<Part> parts = new ArrayList<>();

    public String firstNameArea;
    public String lastName;
    public String email;
    public String homePhone;
    public String cellPhone;
    public String addressLine1;
    public String addressLine2;
    public String city;
    public String state;
    public String zip;

    public PlayerBuilder() {
    }

    public PlayerBuilder firstNameArea(String firstNameArea) {
        Optional<String> firstNameOpt = Optional.ofNullable(firstNameArea);
        firstNameOpt.ifPresent(gottenFirst -> this.firstNameArea = gottenFirst);
        return this;
    }

    public PlayerBuilder lastName(String lastName) {
        Optional<String> firstNameOpt = Optional.ofNullable(lastName);
        firstNameOpt.ifPresent(gotten -> this.lastName = gotten);
        return this;
    }

    public PlayerBuilder type(Type type) {
        Optional<Type> typeOpt = Optional.ofNullable(type);
        typeOpt.ifPresent(gotten -> this.type = gotten);
        return this;
    }

    public PlayerBuilder rank(int rank) {
        if (rank > 0) {
            this.rank = rank;
        }
        return this;
    }

    public PlayerBuilder parts(List<Part> parts) {
        Optional<List<Part>> partsOpt = Optional.ofNullable(parts);
        partsOpt.ifPresent(gottenParts -> this.parts = gottenParts);
        return this;
    }

    public PlayerBuilder addAPart(Part part) {
        Optional<Part> partOpt = Optional.ofNullable(part);
        partOpt.ifPresent(gotten -> this.parts.add(gotten));
        return this;
    }


    public PlayerBuilder email(String email) {
        Optional<String> emailOpt = Optional.ofNullable(email);
        emailOpt.ifPresent(gotten -> this.email = gotten);
        return this;
    }

    public PlayerBuilder homePhone(String homePhone) {
        Optional<String> homePhoneOpt = Optional.ofNullable(homePhone);
        homePhoneOpt.ifPresent(gotten -> this.homePhone = gotten);
        return this;
    }

    public PlayerBuilder cellPhone(String cellPhone) {
        Optional<String> cellPhoneOpt = Optional.ofNullable(cellPhone);
        cellPhoneOpt.ifPresent(gotten -> this.cellPhone = gotten);
        return this;
    }

    public PlayerBuilder addressLine1(String addressLine1) {
        Optional<String> addressLine1Opt = Optional.ofNullable(addressLine1);
        addressLine1Opt.ifPresent(gotten -> this.addressLine1 = gotten);
        return this;
    }

    public PlayerBuilder addressLine2(String addressLine2) {
        Optional<String> addressLine2Opt = Optional.ofNullable(addressLine2);
        addressLine2Opt.ifPresent(gotten -> this.addressLine2 = gotten);
        return this;
    }

    public PlayerBuilder city(String city) {
        Optional<String> cityOpt = Optional.ofNullable(city);
        cityOpt.ifPresent(gotten -> this.city = gotten);
        return this;
    }

    public PlayerBuilder state(String state) {
        Optional<String> stateOpt = Optional.ofNullable(state);
        stateOpt.ifPresent(gotten -> this.state = gotten);
        return this;
    }

    public PlayerBuilder zip(String zip) {
        Optional<String> zipOpt = Optional.ofNullable(zip);
        zipOpt.ifPresent(gotten -> this.zip = gotten);
        return this;
    }

    public Player build() {
        return new Player(this);
    }


}
