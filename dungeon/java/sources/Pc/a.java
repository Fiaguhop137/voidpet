package Pc;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f8876d = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f8877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f8878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SharedPreferences f8879c;

    public a(Context context) {
        this.f8878b = context;
        this.f8879c = context.getSharedPreferences("host.exp.exponent.SharedPreferences", 0);
    }

    protected File a() {
        return new File(this.f8878b.getNoBackupFilesDir(), "expo_notifications_installation_uuid.txt");
    }

    public String b() {
        String strC = c();
        if (strC != null) {
            return strC;
        }
        String string = UUID.randomUUID().toString();
        this.f8877a = string;
        try {
            e(string);
        } catch (IOException e10) {
            Log.e(f8876d, "Error while writing new UUID. " + e10);
        }
        return this.f8877a;
    }

    public String c() {
        String str = this.f8877a;
        if (str != null) {
            return str;
        }
        String strD = d(new File(this.f8878b.getNoBackupFilesDir(), "expo_notifications_installation_uuid.txt"));
        this.f8877a = strD;
        if (strD != null) {
            return strD;
        }
        String string = this.f8879c.getString("uuid", null);
        this.f8877a = string;
        if (string != null) {
            try {
                e(string);
                this.f8879c.edit().remove("uuid").apply();
            } catch (IOException e10) {
                Log.e(f8876d, "Error while migrating UUID from legacy storage. " + e10);
            }
            return this.f8877a;
        }
        String strD2 = d(new File(this.f8878b.getNoBackupFilesDir(), "expo_installation_uuid.txt"));
        this.f8877a = strD2;
        if (strD2 == null) {
            return strD2;
        }
        try {
            e(strD2);
        } catch (IOException e11) {
            Log.e(f8876d, "Error while migrating UUID from legacy storage. " + e11);
        }
        return this.f8877a;
    }

    protected String d(File file) {
        try {
            FileReader fileReader = new FileReader(file);
            try {
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                try {
                    String string = UUID.fromString(bufferedReader.readLine()).toString();
                    bufferedReader.close();
                    fileReader.close();
                    return string;
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    fileReader.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException | IllegalArgumentException unused) {
            return null;
        }
    }

    protected void e(String str) throws IOException {
        FileWriter fileWriter = new FileWriter(a());
        try {
            fileWriter.write(str);
            fileWriter.close();
        } catch (Throwable th) {
            try {
                fileWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
