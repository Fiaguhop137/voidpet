package D0;

import java.text.CharacterIterator;

/* JADX INFO: loaded from: classes.dex */
public final class C implements CharacterIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f2017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f2020d;

    public C(CharSequence charSequence, int i10, int i11) {
        this.f2017a = charSequence;
        this.f2018b = i10;
        this.f2019c = i11;
        this.f2020d = i10;
    }

    @Override // java.text.CharacterIterator
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public char current() {
        int i10 = this.f2020d;
        if (i10 == this.f2019c) {
            return (char) 65535;
        }
        return this.f2017a.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public char first() {
        this.f2020d = this.f2018b;
        return current();
    }

    @Override // java.text.CharacterIterator
    public int getBeginIndex() {
        return this.f2018b;
    }

    @Override // java.text.CharacterIterator
    public int getEndIndex() {
        return this.f2019c;
    }

    @Override // java.text.CharacterIterator
    public int getIndex() {
        return this.f2020d;
    }

    @Override // java.text.CharacterIterator
    public char last() {
        int i10 = this.f2018b;
        int i11 = this.f2019c;
        if (i10 == i11) {
            this.f2020d = i11;
            return (char) 65535;
        }
        int i12 = i11 - 1;
        this.f2020d = i12;
        return this.f2017a.charAt(i12);
    }

    @Override // java.text.CharacterIterator
    public char next() {
        int i10 = this.f2020d + 1;
        this.f2020d = i10;
        int i11 = this.f2019c;
        if (i10 < i11) {
            return this.f2017a.charAt(i10);
        }
        this.f2020d = i11;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public char previous() {
        int i10 = this.f2020d;
        if (i10 <= this.f2018b) {
            return (char) 65535;
        }
        int i11 = i10 - 1;
        this.f2020d = i11;
        return this.f2017a.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public char setIndex(int i10) {
        int i11 = this.f2018b;
        if (i10 > this.f2019c || i11 > i10) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f2020d = i10;
        return current();
    }
}
