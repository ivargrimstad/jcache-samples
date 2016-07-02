package eu.agilejava.jcache;

import javax.annotation.PostConstruct;
import javax.cache.CacheManager;
import javax.cache.Caching;
import javax.ejb.Singleton;
import javax.ejb.Startup;
/**
 *
 * @author Ivar Grimstad (ivar.grimstad@gmail.com)
 */
@Startup
@Singleton
public class Config {

    
    @PostConstruct
    public void init() {
        
        CacheManager mgr = Caching.getCachingProvider().getCacheManager();
    }
}
