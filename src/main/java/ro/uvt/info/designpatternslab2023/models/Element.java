package ro.uvt.info.designpatternslab2023.models;

interface Element extends Visitee{

    default Element getElement(int index){
        return this;
    };
    default void add(Element element) {
        throw new UnsupportedOperationException("Cannot add element to leaf");
    }
    default void remove(Element element) {
        throw new UnsupportedOperationException("Cannot remove element from leaf");
    }
}