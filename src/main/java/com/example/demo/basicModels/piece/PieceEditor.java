package com.example.demo.basicModels.piece;


import java.time.LocalDate;
import java.util.Optional;

public class PieceEditor {

    public Piece storedPiece;

    public PieceEditor(Piece storedPiece) {
        this.storedPiece = storedPiece;
    }

    public void editFrom(Piece incoming) {
        Optional<String> prefixOpt = Optional.ofNullable(incoming.getPrefix());
        Optional<String> libNumberOpt = Optional.ofNullable(incoming.getLibNumber());
        Optional<String> suffixOpt = Optional.ofNullable(incoming.getSuffix());
        Optional<String> composerNameOpt = Optional.ofNullable(incoming.getComposerName());
        Optional<String> arrangerOpt = Optional.ofNullable(incoming.getArranger());
        Optional<String> titleOpt = Optional.ofNullable(incoming.getTitle());
        Optional<String> publisherOpt = Optional.ofNullable(incoming.getPublisher());
        Optional<String> durationOpt = Optional.ofNullable(incoming.getDuration());
        Optional<String> instrumentationOpt = Optional.ofNullable(incoming.getInstrumentation());
        Optional<String> vocalistSoloistOpt = Optional.ofNullable(incoming.getVocalistSoloist());
        Optional<String> percBreakdownOpt = Optional.ofNullable(incoming.getPercBreakdown());
        Optional<String> notesOpt = Optional.ofNullable(incoming.getNotes());
        Optional<String> statusOpt = Optional.ofNullable(incoming.getStatus());
        Optional<String> signOpt = Optional.ofNullable(incoming.getSign());
        Optional<LocalDate> updatedOpt = Optional.ofNullable(incoming.getUpdated());

        prefixOpt.ifPresent(gotten -> storedPiece.setPrefix(incoming.getPrefix()));
        libNumberOpt.ifPresent(gotten -> storedPiece.setLibNumber(incoming.getLibNumber()));
        suffixOpt.ifPresent(gotten -> storedPiece.setSuffix(incoming.getSuffix()));
        composerNameOpt.ifPresent(gotten -> storedPiece.setComposerName(incoming.getComposerName()));
        arrangerOpt.ifPresent(gotten -> storedPiece.setArranger(incoming.getArranger()));
        titleOpt.ifPresent(gotten -> storedPiece.setTitle(incoming.getTitle()));
        publisherOpt.ifPresent(gotten -> storedPiece.setPublisher(incoming.getPublisher()));
        durationOpt.ifPresent(gotten -> storedPiece.setDuration(incoming.getDuration()));
        instrumentationOpt.ifPresent(gotten -> storedPiece.setInstrumentation(incoming.getInstrumentation()));
        vocalistSoloistOpt.ifPresent(gotten -> storedPiece.setVocalistSoloist(incoming.getVocalistSoloist()));
        percBreakdownOpt.ifPresent(gotten -> storedPiece.setPercBreakdown(incoming.getPercBreakdown()));
        notesOpt.ifPresent(gotten -> storedPiece.setNotes(incoming.getNotes()));
        statusOpt.ifPresent(gotten -> storedPiece.setStatus(incoming.getStatus()));
        signOpt.ifPresent(gotten -> storedPiece.setSign(incoming.getSign()));
        updatedOpt.ifPresent(gotten -> storedPiece.setUpdated(incoming.getUpdated()));


    }


}
