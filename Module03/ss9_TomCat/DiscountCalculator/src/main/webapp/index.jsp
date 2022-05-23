
<!DOCTYPE HTML>
<html>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
<body>
<h1 style="margin-top: 30px; color: cornflowerblue; text-align: center; font-weight: 100">Product Discount Calculator</h1>
<form style="margin: 100px" method="post" action="/display-discount">
  <div class="form-group row">
    <label  class="col-sm-2 col-form-label">Product Description:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="description">
    </div>
  </div>
  <div class="form-group row">
    <label  class="col-sm-2 col-form-label">List Price:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="price">
    </div>
  </div>
  <div class="form-group row">
    <label  class="col-sm-2 col-form-label">Discount Percent:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="percent">
    </div>
  </div>

  <div class="form-group row">
    <div class="col-sm-10">
      <button type="submit" class="btn btn-primary">Calculate Discount</button>
    </div>
  </div>
</form>
</body>
</html>