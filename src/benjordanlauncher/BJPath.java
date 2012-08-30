package benjordanlauncher;

import java.util.prefs.Preferences;

public class BJPath {

    private Preferences prefs;
    public static final String DEFAULT = "C:\\";
    public static final String ID = "BJPath";
    public static final String ID2 = "IsPathSet";
    
    BJPath(){
        prefs = Preferences.userRoot().node(this.getClass().getName());
    }
    
    public void setDefaultPath(String path) {
        prefs.put(ID, path);
    }
    
    public String getDefaultPath() {
        String defaultPath = prefs.get(ID, DEFAULT);
        return defaultPath;
    }
    
    public boolean getSetup() {
        return prefs.getBoolean(ID2, false); 
    } 
    
    public void setSetup(boolean b) {
        prefs.putBoolean(ID2, b);
    }
    
}
