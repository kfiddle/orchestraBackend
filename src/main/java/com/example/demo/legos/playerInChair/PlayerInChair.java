package com.example.demo.legos.playerInChair;


import com.example.demo.basicModels.player.Player;
import com.example.demo.basicModels.show.Show;
import com.example.demo.legos.ShowPiece;
import com.example.demo.legos.emptyChair.Chair;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PlayerInChair implements Comparable<PlayerInChair> {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Player player;

    @ManyToOne
    private ShowPiece showPiece;

    @ManyToOne
    private Show show;

    @ManyToOne
    private Chair chair;

    private int sectionSeat;

    public PlayerInChair() {
    }

    public PlayerInChair(ShowPiece showPiece, Chair chair) {
        this.showPiece = showPiece;
        this.chair = chair;
    }

    public PlayerInChair(ShowPiece showPiece, Chair chair, int sectionSeat) {
        this.showPiece = showPiece;
        this.chair = chair;
        this.sectionSeat = sectionSeat;
    }

    public PlayerInChair(Show showForChair, Chair chair) {
        this.show = showForChair;
        this.chair = chair;
    }

    public PlayerInChair(Show show, Chair chair, int sectionSeat) {
        this.show = show;
        this.chair = chair;
        this.sectionSeat = sectionSeat;
    }


    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setShowPiece(ShowPiece showPiece) {
        this.showPiece = showPiece;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public void setSectionSeat(int sectionSeat) {
        this.sectionSeat = sectionSeat;
    }

    public Long getId() {
        return id;
    }

    public Player getPlayer() {
        return player;
    }

    public ShowPiece getShowPiece() {
        return showPiece;
    }

    public Show getShow() {
        return show;
    }

    public Chair getChair() {
        return chair;
    }

    public int getSectionSeat() {
        return sectionSeat;
    }

    public boolean hasThisPlayer(Player incomingPlayer) {
        return player != null && player.equals(incomingPlayer);
    }


    @Override
    public int compareTo(PlayerInChair next) {

        if (chair.compareTo(next.getChair()) != 0) {
            return chair.compareTo(next.getChair());
        } else if (sectionSeat < next.sectionSeat) {
            return -1;
        } else {
            return 1;
        }
    }
}


