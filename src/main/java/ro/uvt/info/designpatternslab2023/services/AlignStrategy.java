package ro.uvt.info.designpatternslab2023.services;

import ro.uvt.info.designpatternslab2023.models.Context;

public interface AlignStrategy {
    public void render(String paragraph, Context context);
}