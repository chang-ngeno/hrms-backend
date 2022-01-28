package changsoft.hrms.business.abstracts;

import java.util.List;

import changsoft.hrms.core.utilities.results.DataResult;
import changsoft.hrms.core.utilities.results.Result;
import changsoft.hrms.entities.concretes.Language;
import changsoft.hrms.entities.dtos.language.LanguageSaveDto;

public interface LanguageService {
    //Get
    DataResult<List<Language>> getAll();
    DataResult<List<Language>> getAllByResumeId(int resumeId);
    DataResult<Language> getById(int id);
    DataResult<List<Language>> getByIds(List<Integer> ids);

    //Post
    Result save(LanguageSaveDto language);

    //Delete
    Result delete(Language language);
    Result deleteById(int id);
    Result deleteByIds(List<Integer> ids);
    Result deleteAll(List<Language> languages);
}
