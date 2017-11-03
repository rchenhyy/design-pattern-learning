package com.rchenhyy.helloworld.dp.structural.flyweight;

/**
 * 叶节点图元
 *
 * @author chenjiahua.chen
 * @version v1.0.0
 * @since 17/11/3
 */
public abstract class LeafGlyph implements Glyph {

    @Override
    public GlyphIterator glyphIterator() {
        return new NOPGlyphIterator();
    }

    // 默认无操作的GlyphIterator, 相当于一个空的iterator
    private static class NOPGlyphIterator implements GlyphIterator {
        @Override
        public void setFont(Font font, GlyphContext context) {

        }

        @Override
        public Font getFont(GlyphContext context) {
            return null;
        }

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Glyph next() {
            return null;
        }

        @Override
        public boolean hasPrevious() {
            return false;
        }

        @Override
        public Glyph previous() {
            return null;
        }

        @Override
        public int nextIndex() {
            return 0;
        }

        @Override
        public int previousIndex() {
            return 0;
        }

        @Override
        public void remove() {

        }

        @Override
        public void set(Glyph glyph) {

        }

        @Override
        public void add(Glyph glyph) {

        }
    }
}
