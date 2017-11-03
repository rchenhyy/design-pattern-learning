package com.rchenhyy.helloworld.dp.structural.flyweight;

/**
 * 图元
 *
 * @author chenjiahua.chen
 * @version v1.0.0
 * @since 17/11/2
 */
public interface Glyph {

    void draw(Window window, GlyphContext context);

    // composite's iterator, equivalent to:
    // first, next, isDone, current, insert, remove

    GlyphIterator glyphIterator();
}
