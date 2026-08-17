package expo.modules.updates;

import Ad.j;
import Ad.n;
import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.io.r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f41502a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f41503b = h.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char[] f41504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Lazy f41505d;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41506a;

        static {
            int[] iArr = new int[d.a.values().length];
            try {
                iArr[d.a.f41459a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.a.f41460b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.a.f41461c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.a.f41462d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f41506a = iArr;
        }
    }

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        f41504c = charArray;
        f41505d = j.b(new p086ed.h());
    }

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pattern b() {
        return Pattern.compile(";\\s*(?:\\s*([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)\\s*=\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?\\s*");
    }

    private final Pattern f() {
        Object value = f41505d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Pattern) value;
    }

    public final String c(p158id.a asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        String strE = asset.e();
        if (asset.j() != null) {
            return asset.j() + strE;
        }
        return "asset-" + new Date().getTime() + "-" + new Random().nextInt() + strE;
    }

    public final Map d(String stringifiedJSON) throws Exception {
        Intrinsics.checkNotNullParameter(stringifiedJSON, "stringifiedJSON");
        JSONObject jSONObject = new JSONObject(stringifiedJSON);
        Iterator<String> itKeys = jSONObject.keys();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object obj = jSONObject.get(next);
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put(next, (String) obj);
            } catch (ClassCastException unused) {
                throw new Exception("The values in the JSON object must be strings");
            }
        }
        return linkedHashMap;
    }

    public final File e(Context context) throws Exception {
        Intrinsics.checkNotNullParameter(context, "context");
        File file = new File(context.getFilesDir(), ".expo-internal");
        if (file.exists()) {
            if (file.isFile()) {
                throw new Exception("File already exists at the location of the Updates Directory: " + file + " ; aborting");
            }
        } else if (!file.mkdir()) {
            throw new Exception("Failed to create Updates Directory: mkdir() returned false");
        }
        return file;
    }

    public final String g(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Matcher matcher = f().matcher(str);
        int iG0 = StringsKt.g0(str, ';', 0, false, 6, null);
        while (iG0 < str.length()) {
            matcher.region(iG0, str.length());
            if (!matcher.lookingAt()) {
                String strSubstring = str.substring(iG0);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + strSubstring + "\" for: \"" + str + "\"").toString());
            }
            String strGroup = matcher.group(1);
            if (strGroup == null) {
                iG0 = matcher.end();
            } else {
                String strGroup2 = matcher.group(2);
                if (strGroup2 == null) {
                    strGroup2 = matcher.group(3);
                } else if (StringsKt.O(strGroup2, "'", false, 2, null) && StringsKt.y(strGroup2, "'", false, 2, null) && strGroup2.length() > 2) {
                    strGroup2 = strGroup2.substring(1, strGroup2.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(strGroup2, "substring(...)");
                }
                if (!linkedHashMap.containsKey(strGroup)) {
                    linkedHashMap.put(strGroup, strGroup2);
                }
                iG0 = matcher.end();
            }
        }
        return (String) linkedHashMap.get("name");
    }

    public final Date h(String dateString) throws ParseException {
        Intrinsics.checkNotNullParameter(dateString, "dateString");
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'X'", Locale.US).parse(dateString);
            Intrinsics.d(date, "null cannot be cast to non-null type java.util.Date");
            return date;
        } catch (Exception unused) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            Date date2 = simpleDateFormat.parse(dateString);
            Intrinsics.d(date2, "null cannot be cast to non-null type java.util.Date");
            return date2;
        }
    }

    public final byte[] i(File file) throws NoSuchAlgorithmException, IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                DigestInputStream digestInputStream = new DigestInputStream(fileInputStream, MessageDigest.getInstance("SHA-256"));
                try {
                    byte[] bArrDigest = digestInputStream.getMessageDigest().digest();
                    Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
                    kotlin.io.c.a(digestInputStream, null);
                    kotlin.io.c.a(fileInputStream, null);
                    return bArrDigest;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        kotlin.io.c.a(digestInputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    kotlin.io.c.a(fileInputStream, th3);
                    throw th4;
                }
            }
        } catch (IOException e10) {
            Log.e(f41503b, "Failed to checksum file via SHA-256: " + file, e10);
            throw e10;
        } catch (NoSuchAlgorithmException e11) {
            Log.e(f41503b, "Failed to checksum file via SHA-256: " + file, e11);
            throw e11;
        }
    }

    public final boolean j(d updatesConfiguration, p265od.g logger, Context context) {
        Intrinsics.checkNotNullParameter(updatesConfiguration, "updatesConfiguration");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(context, "context");
        int i10 = a.f41506a[updatesConfiguration.e().ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                if (i10 == 4) {
                    return true;
                }
                throw new n();
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                logger.f("Could not determine active network connection is metered; not checking for updates", new Exception("Null ConnectivityManager system service"), p265od.b.Unknown);
                return false;
            }
            if (!connectivityManager.isActiveNetworkMetered()) {
                return true;
            }
        }
        return false;
    }

    public final byte[] k(InputStream inputStream, File destination, String str) throws IOException {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(destination, "destination");
        DigestInputStream digestInputStream = new DigestInputStream(inputStream, MessageDigest.getInstance("SHA-256"));
        try {
            File file = new File(destination.getAbsolutePath() + ".tmp");
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    kotlin.io.b.b(digestInputStream, fileOutputStream, 0, 2, null);
                    kotlin.io.c.a(fileOutputStream, null);
                    kotlin.io.c.a(digestInputStream, null);
                    byte[] bArrDigest = digestInputStream.getMessageDigest().digest();
                    String strEncodeToString = Base64.encodeToString(bArrDigest, 11);
                    if (str != null && !Intrinsics.b(str, strEncodeToString)) {
                        throw new IOException("File download was successful but base64url-encoded SHA-256 did not match expected; expected: " + str + "; actual: " + strEncodeToString);
                    }
                    try {
                        try {
                            try {
                                kotlin.io.j.x(file, destination, true, 0, 4, null);
                                file.delete();
                                Intrinsics.c(bArrDigest);
                                kotlin.io.c.a(digestInputStream, null);
                                return bArrDigest;
                            } catch (Throwable th) {
                                file.delete();
                                throw th;
                            }
                        } catch (Exception e10) {
                            throw new IOException("File download was successful, but an exception occurred: " + e10);
                        }
                    } catch (r unused) {
                        throw new IOException("File download was successful, but temp file " + file.getAbsolutePath() + " does not exist");
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        kotlin.io.c.a(fileOutputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    kotlin.io.c.a(digestInputStream, th4);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                kotlin.io.c.a(digestInputStream, th6);
                throw th7;
            }
        }
    }
}
