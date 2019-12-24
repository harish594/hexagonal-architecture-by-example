package tech.allegro.hexagon.articles.adapters.notifications;

import tech.allegro.hexagon.articles.domain.model.Article;
import tech.allegro.hexagon.articles.domain.ports.ArticleAuthorNotifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
class ArticleAuthorMailNotifier implements ArticleAuthorNotifier {

    private final Logger log = LoggerFactory.getLogger(ArticleAuthorMailNotifier.class);

    @Override
    public void notifyAboutArticleCreation(final Article article) {
        /**
         * mail system integration implementation using {@link ArticleMailModel} comes here
         */
        log.info("Mail sent to author: \"{}\"", article.author().name());
    }
}