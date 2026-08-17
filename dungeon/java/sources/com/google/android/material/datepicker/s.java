package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final s f36639c = new s(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Long f36640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TimeZone f36641b;

    private s(Long l10, TimeZone timeZone) {
        this.f36640a = l10;
        this.f36641b = timeZone;
    }

    static s c() {
        return f36639c;
    }

    Calendar a() {
        return b(this.f36641b);
    }

    Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l10 = this.f36640a;
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        return calendar;
    }
}
