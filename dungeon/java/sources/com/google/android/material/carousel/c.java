package com.google.android.material.carousel;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f36379a;

    class a extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CarouselLayoutManager f36380b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, CarouselLayoutManager carouselLayoutManager) {
            super(i10, null);
            this.f36380b = carouselLayoutManager;
        }

        @Override // com.google.android.material.carousel.c
        public float d(RecyclerView.p pVar) {
            return ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // com.google.android.material.carousel.c
        int e() {
            return this.f36380b.b0();
        }

        @Override // com.google.android.material.carousel.c
        int f() {
            return e();
        }

        @Override // com.google.android.material.carousel.c
        int g() {
            return this.f36380b.i0();
        }

        @Override // com.google.android.material.carousel.c
        int h() {
            return this.f36380b.s0() - this.f36380b.j0();
        }

        @Override // com.google.android.material.carousel.c
        int i() {
            return j();
        }

        @Override // com.google.android.material.carousel.c
        int j() {
            return 0;
        }

        @Override // com.google.android.material.carousel.c
        public void k(View view, int i10, int i11) {
            int iG = g();
            this.f36380b.D0(view, iG, i10, iG + m(view), i11);
        }

        @Override // com.google.android.material.carousel.c
        public void l(View view, Rect rect, float f10, float f11) {
            view.offsetTopAndBottom((int) (f11 - (rect.top + f10)));
        }

        int m(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f36380b.X(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }
    }

    class b extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CarouselLayoutManager f36381b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, CarouselLayoutManager carouselLayoutManager) {
            super(i10, null);
            this.f36381b = carouselLayoutManager;
        }

        @Override // com.google.android.material.carousel.c
        public float d(RecyclerView.p pVar) {
            return ((ViewGroup.MarginLayoutParams) pVar).rightMargin + ((ViewGroup.MarginLayoutParams) pVar).leftMargin;
        }

        @Override // com.google.android.material.carousel.c
        int e() {
            return this.f36381b.b0() - this.f36381b.h0();
        }

        @Override // com.google.android.material.carousel.c
        int f() {
            return this.f36381b.F2() ? g() : h();
        }

        @Override // com.google.android.material.carousel.c
        int g() {
            return 0;
        }

        @Override // com.google.android.material.carousel.c
        int h() {
            return this.f36381b.s0();
        }

        @Override // com.google.android.material.carousel.c
        int i() {
            return this.f36381b.F2() ? h() : g();
        }

        @Override // com.google.android.material.carousel.c
        int j() {
            return this.f36381b.k0();
        }

        @Override // com.google.android.material.carousel.c
        public void k(View view, int i10, int i11) {
            int iJ = j();
            this.f36381b.D0(view, i10, iJ, i11, iJ + m(view));
        }

        @Override // com.google.android.material.carousel.c
        public void l(View view, Rect rect, float f10, float f11) {
            view.offsetLeftAndRight((int) (f11 - (rect.left + f10)));
        }

        int m(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f36381b.W(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }
    }

    private c(int i10) {
        this.f36379a = i10;
    }

    /* synthetic */ c(int i10, a aVar) {
        this(i10);
    }

    private static c a(CarouselLayoutManager carouselLayoutManager) {
        return new b(0, carouselLayoutManager);
    }

    static c b(CarouselLayoutManager carouselLayoutManager, int i10) {
        if (i10 == 0) {
            return a(carouselLayoutManager);
        }
        if (i10 == 1) {
            return c(carouselLayoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    private static c c(CarouselLayoutManager carouselLayoutManager) {
        return new a(1, carouselLayoutManager);
    }

    abstract float d(RecyclerView.p pVar);

    abstract int e();

    abstract int f();

    abstract int g();

    abstract int h();

    abstract int i();

    abstract int j();

    abstract void k(View view, int i10, int i11);

    abstract void l(View view, Rect rect, float f10, float f11);
}
