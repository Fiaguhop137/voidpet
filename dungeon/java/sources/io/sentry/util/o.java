package io.sentry.util;

import io.sentry.B0;
import io.sentry.EnumC3721i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC3703f0;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Charset f46569a = Charset.forName("UTF-8");

    private static final class b extends Writer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f46570a;

        private b() {
            this.f46570a = 0L;
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        private static int b(char c10) {
            if (c10 <= 127) {
                return 1;
            }
            return (c10 > 2047 && !Character.isSurrogate(c10)) ? 3 : 2;
        }

        public long a() {
            return this.f46570a;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(int i10) {
            this.f46570a += (long) b((char) i10);
        }

        @Override // java.io.Writer
        public void write(String str, int i10, int i11) {
            for (int i12 = i10; i12 < i10 + i11; i12++) {
                this.f46570a += (long) b(str.charAt(i12));
            }
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            for (int i12 = i10; i12 < i10 + i11; i12++) {
                this.f46570a += (long) b(cArr[i12]);
            }
        }
    }

    public static List a(AtomicIntegerArray atomicIntegerArray) {
        int length = atomicIntegerArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(Integer.valueOf(atomicIntegerArray.get(i10)));
        }
        return arrayList;
    }

    public static long b(InterfaceC3703f0 interfaceC3703f0, ILogger iLogger, B0 b10) {
        if (b10 == null) {
            return 0L;
        }
        try {
            b bVar = new b(null);
            interfaceC3703f0.a(b10, bVar);
            return bVar.a();
        } catch (Throwable th) {
            iLogger.b(EnumC3721i3.ERROR, "Could not calculate size of serializable", th);
            return 0L;
        }
    }

    public static byte[] c(InterfaceC3703f0 interfaceC3703f0, ILogger iLogger, B0 b10) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f46569a));
                try {
                    interfaceC3703f0.a(b10, bufferedWriter);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    bufferedWriter.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (Throwable th) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            iLogger.b(EnumC3721i3.ERROR, "Could not serialize serializable", th5);
            return null;
        }
    }

    public static Map d(Calendar calendar) {
        HashMap map = new HashMap();
        map.put("year", Integer.valueOf(calendar.get(1)));
        map.put("month", Integer.valueOf(calendar.get(2)));
        map.put("dayOfMonth", Integer.valueOf(calendar.get(5)));
        map.put("hourOfDay", Integer.valueOf(calendar.get(11)));
        map.put("minute", Integer.valueOf(calendar.get(12)));
        map.put("second", Integer.valueOf(calendar.get(13)));
        return map;
    }
}
