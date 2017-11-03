package com.rchenhyy.helloworld.dp.structural.flyweight;

import java.util.ListIterator;

/**
 * @author chenjiahua.chen
 * @version v1.0.0
 * @since 17/11/3
 */
public interface GlyphIterator extends ListIterator<Glyph> {

    // operations on Glyph through iteration

    void setFont(Font font, GlyphContext context);

    Font getFont(GlyphContext context);
}
