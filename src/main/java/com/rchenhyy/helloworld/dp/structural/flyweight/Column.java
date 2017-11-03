package com.rchenhyy.helloworld.dp.structural.flyweight;

/**
 * 列
 *
 * @author chenjiahua.chen
 * @version v1.0.0
 * @since 17/11/3
 */
public class Column implements Glyph {
    @Override
    public void draw(Window window, GlyphContext context) {
        // TO.DO. draw a column
    }

    @Override
    public GlyphIterator glyphIterator() {
        // TO.DO. implements a GlyphIterator corresponding to Row
        return null;
    }
}
