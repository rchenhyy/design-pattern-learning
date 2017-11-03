package com.rchenhyy.helloworld.dp.structural.flyweight;

/**
 * 行
 *
 * @author chenjiahua.chen
 * @version v1.0.0
 * @since 17/11/3
 */
public class Row implements Glyph {
    @Override
    public void draw(Window window, GlyphContext context) {
        // draw a row
    }

    @Override
    public GlyphIterator glyphIterator() {
        // TO.DO. implements a GlyphIterator corresponding to Row
        return null;
    }
}
