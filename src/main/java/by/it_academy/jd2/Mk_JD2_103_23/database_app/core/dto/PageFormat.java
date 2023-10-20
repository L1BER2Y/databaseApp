package by.it_academy.jd2.Mk_JD2_103_23.database_app.core.dto;

import java.util.Objects;

public class PageFormat {
    private int page;
    private int size;

    public PageFormat(int page, int size) {
        this.page = page;
        this.size = size;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PageFormat that = (PageFormat) o;
        return page == that.page && size == that.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(page, size);
    }

    @Override
    public String toString() {
        return "PageFormat{" +
                "page=" + page +
                ", size=" + size +
                '}';
    }
}
